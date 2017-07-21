
# TesExecutor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**imageName** | **String** | Name of the container image, for example: ubuntu quay.io/aptible/ubuntu gcr.io/my-org/my-image etc... |  [optional]
**cmd** | **List&lt;String&gt;** | The command to be executed. |  [optional]
**workdir** | **String** | The working directory that the command will be executed in. Defaults to the directory set by the container image. |  [optional]
**stdin** | **String** | Path inside the container to a file which will be piped to the command&#39;s stdin. |  [optional]
**stdout** | **String** | Path inside the container to a file where the command&#39;s stdout will be written to. |  [optional]
**stderr** | **String** | Path inside the container to a file where the command&#39;s stderr will be written to. |  [optional]
**ports** | [**List&lt;OUTPUTONLYPorts&gt;**](OUTPUTONLYPorts.md) | Port to expose from within the container, blank if none. |  [optional]
**environ** | **Map&lt;String, String&gt;** | Enviromental variables to set within the container. |  [optional]



