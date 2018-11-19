#!/bin/sh

MAXHEAP="-Xmx10g"
OPTS_FROM_ORIENTDB="-Djna.nosys=true -XX:+HeapDumpOnOutOfMemoryError -XX:MaxDirectMemorySize=512g -Djava.awt.headless=true -Dfile.encoding=UTF8 -Drhino.opt.level=9"
#For Visualvm monitoring
JMX=" -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=1999 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -Djava.rmi.server.hostname=147.172.177.204"

OCTOPUS_HOME="$( cd "$( dirname "$0" )" && pwd )"

while getopts :d: opt
do
	case $opt in
		d) JAVA_OPTS="$JAVA_OPTS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=$OPTARG"
	esac
done

export JAVA_OPTS

exec java -Dio.netty.leakDetectionLevel=advanced $JMX $JAVA_OPTS $MAXHEAP $OPTS_FROM_ORIENTDB -DOCTOPUS_HOME="$OCTOPUS_HOME" -cp "$OCTOPUS_HOME/extensions/*:$OCTOPUS_HOME/lib/*:$OCTOPUS_HOME/build/libs/octopus.jar" octopus.OctopusMain
