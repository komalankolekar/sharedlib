
def call(username){
    echo "Hi ${username}"
    if ("${username}" != "[admin]" || "${username}" != "[komal]"){
        echo "$username does not have required privilege"
        currentBuild.result = 'FAILURE'
        //error "$username can execute pipeline only for dev environments!"   // only added this line
        sh "exit 1"
        return
    }
    else{
        echo "$username allowed to execute this pipeline"
    }
}
