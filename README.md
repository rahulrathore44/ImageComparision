# ImageComparision
This api will compare two images and return "true" or "false" based on the equality.
The call to api is as ImageHelper.areImgSame(Object aImg, Object bImg). The first argument should of type java.net.URL which refer to the image present at the weblink. The second argument should of type String which represent the image file present locally.

# Usage

```java

ImageHelper.areImgSame(new URL("http://www.abc.com/image/src.jpg"),new URL("http://www.abc.com/image/dst.jpg")) 

ImageHelper.areImgSame("c:\\src.jpg"),"c:\\dst.jpg")

```
