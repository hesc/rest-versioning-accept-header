# rest-versioning-accept-header
This is an example for rest API versioning with the accept header.
It is implemented with Jersey (JAX-RS) and Dropwizard.


Version 1
curl -X GET  -H "Accept: application/vnd.customerservice-v1+json"  localhost:8080/customer


Version 2
curl -X GET  -H "Accept: application/vnd.customerservice-v2+json"  localhost:8080/customer
