#include <iostream>
#include <fstream>
#include <string>
#include <cerrno>
#include <ctime>

using namespace std;

inline bool is_first_use_line(const string&);
inline bool is_secs_used_line(const string&);
string get_timestamp();

int main()
{
    string    filename;
    ifstream  infile;
    ofstream  outfile;
    string    line;
    string    tmpfile;

    /* 读取源文件到临时文件，并重新设置使用日期等参数 */
    filename  = "D:\\Program Files\\myBase6\\nyfedit.ini";
    infile.open(filename.c_str());

    while (getline(infile, line))
    {
        if (is_first_use_line(line))
        {
            line = "App.UserLic.FirstUseOn=" + get_timestamp();
        } 

        if (is_secs_used_line(line))
        {
            line = "App.UserLic.SecsUsed=0";
        }

        tmpfile += line + "\n";
    }
    infile.close();

    /* 删除原文件 */
    if (remove(filename.c_str()) == -1)
    {
        cerr << "Remove file error: " << strerror(errno) << endl;
        return(EXIT_FAILURE);        
    }

    /* 重新写配置文件 */
    outfile.open(filename.c_str());
    outfile.write(tmpfile.c_str(), tmpfile.size());
    outfile.flush();

    outfile.close();

    return 0;
}

inline bool is_first_use_line(const string& str)
{
    return int(str.find("App.UserLic.FirstUseOn")) >= 0 ? true : false;
}

inline bool is_secs_used_line(const string& str)
{
    return int(str.find("App.UserLic.SecsUsed")) >= 0 ? true : false;
}

string get_timestamp()
{
    time_t rawtime;
    char buf[20];

    time(&rawtime);
    sprintf(buf, "%d", rawtime);

    return buf;
}
