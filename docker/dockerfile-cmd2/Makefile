build:
	docker build -t cmd2 .	 
run:
	docker run -it -d -p 80:80 cmd2	
ps:
	docker ps -a
img:
	docker images
rm:
	docker rm -f $$(docker ps -aq)
rmi:
	docker rmi $$(docker images -q)
