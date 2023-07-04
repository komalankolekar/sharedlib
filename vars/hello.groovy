def call(username){
  echo "Hi ${username}"
   if ("${username}" != "[admin]"){
    echo "This is not admin user and username is $username"
     currentBuild.build().getExecutor().interrupt(Result.ABORTED)
  }
  else{
    echo "This is admin user"
  }  
}
