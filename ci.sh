#!/bin/bash

set -e

export GPG_TTY=$(tty)

apt-get update && apt-get install -qy xmlstarlet libxml2-utils
echo -e "$GPG_KEY_SECRET" | gpg --import
mvn clean install -Prelease -s settings.xml
