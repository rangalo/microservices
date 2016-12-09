#!/bin/bash
echo "=> Waiting or mysql to start"
sleep 30
./createDatabase.sh
./customizeWildfly.sh
echo "=> Starting Wildfly"
./run.sh
