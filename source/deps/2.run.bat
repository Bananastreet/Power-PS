@echo off
title Nightmare-scape
echo Loading Up Files...
"C:\Program Files (x86)\Java\jre1.8.0_45\bin\java.exe" -Xmx1024m -cp bin;deps/poi.jar;deps/mysql.jar;deps/mina.jar;deps/slf4j.jar;deps/slf4j-nop.jar;deps/jython.jar;log4j-1.2.15.jar; server.Server
pause