
# OUTPUTONLYInputs

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**url** | **String** | URL in long term storage, for example: s3://my-object-store/file1 gs://my-bucket/file2 file:///path/to/my/file /path/to/my/file etc... |  [optional]
**path** | **String** | Path of the file inside the container. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**contents** | **String** | File contents literal.  Implementations should support a minimum of 128 KiB in this field and may define its own maximum. UTF-8 encoded |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
FILE | &quot;FILE&quot;
DIRECTORY | &quot;DIRECTORY&quot;



