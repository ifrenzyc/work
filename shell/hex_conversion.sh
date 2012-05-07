#!/bin/bash
# filename: hex_conversion.sh
# 用途：进制转换

# 十进制转为二进制
no=100
echo "obase=2;$no" | bc

# 二进制转为十进制
no=1100100
echo "obase=10;ibase=2;${no}" | bc
