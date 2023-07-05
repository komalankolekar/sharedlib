
def call(username){
  echo "Hi ${username}"
   if ("${username}" != "[admin]"){
    echo "This is not admin user and username is $username"
   
  currentBuild.result = 'FAILURE'
  return
     sh 'exit 1'
     //echo "after fail"
  }
  else{
    echo "This is admin user"
  }  
}
