def call(username){
  echo "Hi ${username}"
   if ("${username}" != "[admin]"){
    echo "This is not admin user and username is $username"
  }
  else{
    echo "This is admin user"
    currentBuild.build().getExecutor().interrupt(Result.ABORTED)
  }  
}
