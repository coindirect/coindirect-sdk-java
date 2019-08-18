#!/bin/bash

set -e

eval $(gpg-agent --daemon --no-grab --write-env-file $HOME/.gpg-agent-info)
export GPG_TTY=$(tty)
export GPG_AGENT_INFO

# apt-get update && apt-get install -qy xmlstarlet libxml2-utils
echo -e "$GPG_KEY_SECRET" | gpg --batch --import
gpg --list-keys
mvn clean install -Prelease -s settings.xml
