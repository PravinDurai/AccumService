# AccumService
# Contains the list of methods that can be used for fetching the user information
# Available end points are


# Swagger UI provide the template of the payload along with list of fields that has to be populated for any given end points.
# Please have a look at the swagger UI for accessing all the below endpoints -> Choose Summary Controller
# https://accum-service.cfapps.io/swagger-ui.html


# Put: https://p-api-gateway.cfapps.io/accum/user/{username}/price/{price}
# Header -> Bearer : token
# (Used for updating the price for the given user -> internally makes a rest API call to the plan service through 
# Feign client and fetches the information for the given user)

# put: https://p-api-gateway.cfapps.io/accum/user/{username}/service/{count}
# Header -> Bearer : token
# used for updating the count value of the special service that's been used for the given username in the url path
# It's makes a call to the external plan service to get the plan that is choosen by the given user. 
# If there is no plan available the exception will be thrown

#------------------------------------------------------------------------------------------------------------------------------------------------------------------
# PCF DB Credentials for Accum Service 
#------------------------------------------------------------------------------------------------------------------------------------------------------------------
# Host Name : us-cdbr-iron-east-01.cleardb.net
# DB Name   : ad_e01ff2833336ec6
# User Name : b7d8e1998b50b3
# Password  : c77a96f9
