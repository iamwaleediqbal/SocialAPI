
# Social Media Application API

It is a basic understanding of CRUD operations using spring boot framework JAVA and with mongodb authentication.


## API Reference

#### Register 

```http
  POST /register
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `email` | `string` | **Required**. User's Email |
| `password` | `string` | **Required**. User's Password |
| `DOB` | `string` | **Required**. User's DOB |
| `fullname` | `string` | **Required**. User's Fullname |
| `Gender` | `string` | **Required**. User's Gender |

returns String "{Above Credentials}" or "User already exists" in case the user exists in db.

#### Login 
```http
  POST /login
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `email` | `string` | **Required**. User's Email |
| `password` | `string` | **Required**. User's Password |

returns String "{User Object}" or "Some User Logged in" in case there is a user already logged in and "User not Found" if user has not registered.

#### Update Credentials
```http
  PUT /update
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `email` | `string` | **Required**. User's Email |
| `DOB` | `string` | **Required**. User's DOB |
| `fullname` | `string` | **Required**. User's Fullname |
| `Gender` | `string` | **Required**. User's Gender |

returns String {User Object} or "No User Logged in right now" in case there is no user or "No User Found" if user not present in database.

#### Change Password
```http
  PUT /changepassword
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `oldpassword` | `string` | **Required**. User's old Password |
| `newPassword` | `string` | **Required**. User's New Password |

returns String "Password Changed" or "User not Found" in case there is no user.


#### DELETE User
```http
  DELETE /delete
```
returns String "Account Deleted" or "No User Logged in right now" in case there is no user.


#### LogOut User
```http
  GET /logout
```

returns String "Logged Out" or "No User Logged in right now" in case there is no user.


  
