#!/usr/bin/groovy

node {
stage ('checkout') {
scm checkout
}
stage ('build')
{
sh 'maven clean install'
}
}