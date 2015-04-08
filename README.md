# liber-figger

This is a really small demo project shoing how to get a Clojure Compojure/ Liberator application up and running using Docker and Fig. The project includes an embedded Jetty container which is compiled into the uberjar and run with java -jar your-jar-name.jar.

## Usage

Pretty simple really. Make sure you have installed [Docker|https://docs.docker.com/installation/] (Boot2Docker on Mac OSX) and [Fig|http://www.fig.sh/install.html]. Once you've done that, simply run the following command from the project root:

	fig up

Or alternatively if you want to define the fig file manually:

	fig -f fig.yml up

The first run may take a short time to complete (subsequent runs should be quicker) and then you should have an instance up and running. Depending on how you have Docker configured (this assumes that docker is running on 192.168.59.103) you can test the service by running the following command:

	curl 192.168.59.103:8000
	=> Hello from liber-figger


## License

Copyright © 2015 @mikeholmesuk

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
