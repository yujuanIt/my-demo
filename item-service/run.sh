#!/bin/sh

docker run -d --net=mydemo --name item -e SERVICE_HOST=item -e NACOS_HOST=nacos -e ZIPKIN_HOST=zipkin -e SKYWALKING_HOST=skywalking-oap mydemo/item