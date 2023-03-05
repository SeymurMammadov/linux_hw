#!/bin/bash
for run in {1..10}
do
echo $run
date | awk '{print $4}'
# sleep 5
done
cat /etc/os-release | head -1
cat /ect/os-release | awk '{print $2}'
for run in {50..100}.txt
do
touch /opt/run.txt
echo $run
done

