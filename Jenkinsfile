#!/bin/bash/env groovy

node {
stage ('checkout') {
checkout scm
}
stage ('build')
{
sh 'mvn clean install'
}
}
