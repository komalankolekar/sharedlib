def call(username){
  echo "Hi ${username}"
   if ("${username}" != "[admin]"){
    echo "This is not admin user and username is $username"
     //currentBuild.build().getExecutor().interrupt(Result.FAILURE)
     //return
     //def build = Jenkins.instance.getItemByFullName("jobName").getBuildByNumber(jobNumber)
currentBuild.result = 'ABORTED'

     echo "after fail"
  }
  else{
    echo "This is admin user"
  }  
}
