import shutil
import os

#src = 'F:/work/eshore_acc/acc/portal/WebRoot/mgr/verInfoMgr/appStaff'
#dst = 'D:/Programming/tomcat/tomcat6030/webapps/acc/mgr/verInfoMgr/appStaff'

src = 'D:/work/zkzs/msslq/msslq/WebRoot/jsp/school'
dst = 'D:/Programming/tomcat/tomcat6030/webapps/msslq/jsp/school'

for root, dirs, files in os.walk(src):
  for f in files:
    file_path = root + '/' + f
    shutil.copy2(file_path, dst)