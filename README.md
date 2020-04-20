# AccumService
# Contains the list of methods that can be used for fetching the user information
# Available end points are

# /user/{username}/price/{price} 
# (Used for updating the price for the given user -> internally makes a rest API call to the plan service through 
# Feign client and fetches the information for the given user)

# /user/{username}/service/{count}
# used for updating the count value of the special service that's been used for the given username in the url path
# It's makes a call to the external plan service to get the plan that is choosen by the given user. 
# If there is no plan available the exception will be thrown

# If there exist a valid plan for the given user in plan service (This intern fetches the information from database) then the count will be decremented
