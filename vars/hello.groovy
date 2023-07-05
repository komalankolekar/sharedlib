
def call(username){
    echo "Hi ${username}"
    if ("${username}" != "[Singtel IoT]"){
        echo "$username does not have required privilege"
        currentBuild.result = 'FAILURE'
        error "$username can execute pipeline only for dev environments!"   // only added this line
        return
    }
    else{
        echo "$username allowed to execute this pipeline"
    }
}
