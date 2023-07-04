#!/usr/bin/groovy

@Library("username_lib") _

node {

        stage('Copy Scam ouptput file to Jenkins') {
            sh 'echo $PWD'
           //def test = hudson.model.User.current()
           //println test
           def specificCause = currentBuild.getBuildCauses('hudson.model.Cause$UserIdCause')
            if (specificCause) {
                println("Executed by user $specificCause.userName")
                println "$specificCause.userName"
            }
            println "$specificCause.userName"
            hello("$specificCause.userName")
    }
}

