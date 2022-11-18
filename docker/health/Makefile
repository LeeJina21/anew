build:
	docker build -t hedlth_test .	 
run:
	docker run -it --name health_test health_test
inspect:
	docker inspect health_check
ps:
	docker ps -a
img:
	docker images
rm:
	docker rm -f $$(docker ps -aq)
rmi:
	docker rmi $$(docker images -q)
