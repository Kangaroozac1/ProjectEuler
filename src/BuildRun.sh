#!/bin/bash
question_id=$1

#compile
javac com/company/Main.java

#execute
java com/company/Main ${question_id}