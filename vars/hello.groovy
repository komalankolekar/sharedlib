def call(username){
  echo "Hi ${username}"
   if ("${username}" != "[admin]"){
    echo "This is not admin user and username is $username"
     currentBuild.build().getExecutor().interrupt(Result.FAILURE)
  }
  else{
    echo "This is admin user"
  }  
}
