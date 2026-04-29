#!/usr/bin/env bash

(test -n "$1" && echo "One for $1, one for me.")  || (test -z "$1" && echo "One for you, one for me.")