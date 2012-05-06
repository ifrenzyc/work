#!/bin/bash
#Filename: is_root_user.sh

if [ $UID -ne 0 ]; then
	echo "Not root user, please run as root."
else
	echo "Root user"
fi
