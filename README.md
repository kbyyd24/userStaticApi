# user static api

写着玩的，给实验室的前端同学练手`ajax`

# API 

## signup

提供一个用户注册的接口, 使用用户名和密码注册, 前端提供`用户名`和`密码`

- 请求路径: `/user/signup`
- 请求方法: `POST`
- 服务器响应如下:

| username | password | response |
|:-:|:-:|:-:|
| 唐旭东 | tangxudong | success |
| 唐旭西 | tangxuxi | username_existed |

- RequestBody:
```json
{
  "username":"唐旭东",
  "password":"encoded_password"
}
```
- ResponseBody:
```json
{
  "uid":1000,
  "token":"12j3i8d932",
  "status":"success"
}
```
```json
{
  "uid":0,
  "token":null,
  "status":"failed"
}
```

## login

提供用户登录的接口, 使用用户名与密码登录, 接口接收`JSON`格式的请求, 包含`用户名`和`密码`

- 接口地址: /usr/login
- 请求方法: `POST`
- 接口响应:

| username | password | response |
|:-:|:-:|:-:|
| 唐旭东 | tangxudong | success |
| 唐旭西 | tangxuxi | failed |

- RequestBody:
```json
{
  "username":"唐旭东",
  "password":"encoded_password"
}
```
- ResponseBody:
```json
{
  "uid":1000,
  "token":"12j3i8d932",
  "status":"success"
}
```
```json
{
  "uid":0,
  "token":null,
  "status":"failed"
}
```

## rename

提供修改用户名的接口, 在`header`中设置`uid`和`token`, 不设置`header`会导致请求失败

- 接口地址: /usr/rename
- 接口方法: `POST`
- 接口响应:

| header | username | response |
|:-:|:-:|:-:|
| Y | 唐旭东 | success |
| Y | - | failed |
| N | 唐旭东 | failed |

- RequestBody:
```json
{
  "username":"唐旭东"
}
```
- ResponseBody:
```json
{
  "status":"success"
}
```
```json
{
  "status":"failed"
}
```

## logout

提供一个用户注销接口, 在请求中使用`header`, 设置`uid`和`token`属性

- 接口地址: `/user/logout`
- 请求方法: `GET`
- 响应:

| header | response |
|:-:|:-:|
| Y | success |
| N | failed |

- ResponseBody
```json
{
  "status":"success"
}
```