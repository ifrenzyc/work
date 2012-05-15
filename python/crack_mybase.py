import time

timestamp = str(time.time())
timestamp = timestamp[0:timestamp.find(".")]

new_file = ''
with open("D:\\Program Files\\myBase6\\nyfedit.ini", "r") as f:
    for ln in f:
        if ln.find("App.UserLic.FirstUseOn=") != -1:
            new_file = new_file + 'App.UserLic.FirstUseOn=' + timestamp + '\n'  #替换第一次使用的时间
        elif ln.find("App.UserLic.SecsUsed=") != -1:
            new_file = new_file + 'App.UserLic.SecsUsed=0' + '\n'  #替换共使用的时间
        else:
            new_file = new_file + ln

with open("D:\\Program Files\\myBase6\\nyfedit.ini", "w") as f:
    f.write(new_file)