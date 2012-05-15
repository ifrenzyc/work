# -*- coding: utf-8 -*-

import os

for root, dirs, files in os.walk('d:/'):
    print root,dirs,files
