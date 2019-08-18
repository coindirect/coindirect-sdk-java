#!/bin/bash

set -e

eval $(gpg-agent --daemon --no-grab --write-env-file $HOME/.gpg-agent-info)
export GPG_TTY=$(tty)
export GPG_AGENT_INFO

echo -e "$GPG_KEY_SECRET" | gpg --batch --import
gpg --list-keys
mvn clean deploy -Prelease -s settings.xml
