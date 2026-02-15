This project it has been developed using the minikube 
The minikube contains one docker distinct from the host 
1. Configure the docker from Minikube to the host:
   minikube -p minikube docker-env | Invoke-Expression
2. After I will need to create the image already configured at spring
docker build -t spring-app:1.0 . 
3. After it's needing to apply the yaml files
kubectl apply -f directory (mysql - app)
4. After starting the service by minikube
   PS C:\Users\insta\Downloads\spring-compose\spring-compose\k8s> minikube service spring-app
   ┌───────────┬────────────┬─────────────┬───────────────────────────┐
   │ NAMESPACE │    NAME    │ TARGET PORT │            URL            │
   ├───────────┼────────────┼─────────────┼───────────────────────────┤
   │ default   │ spring-app │ 8080        │ http://192.168.49.2:30080 │
   └───────────┴────────────┴─────────────┴───────────────────────────┘
* Starting tunnel for service spring-app.
  ┌───────────┬────────────┬─────────────┬────────────────────────┐
  │ NAMESPACE │    NAME    │ TARGET PORT │          URL           │
  ├───────────┼────────────┼─────────────┼────────────────────────┤
  │ default   │ spring-app │             │ http://127.0.0.1:63316 - This is the url used by postman │
  └───────────┴────────────┴─────────────┴────────────────────────┘
* Opening service default/spring-app in default browser...
  ! Because you are using a Docker driver on windows, the terminal needs to be open to run it.
5. After you will need to call the url:
   http://127.0.0.1:63316/users 
