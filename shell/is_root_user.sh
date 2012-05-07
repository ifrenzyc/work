#!/bin/bash
# filename: is_root_user.sh
# 用途：判断是否为root用户

if [ $UID -ne 0 ]; then
	echo "Not root user, please run as root."
else
	echo "Root user"
fi
