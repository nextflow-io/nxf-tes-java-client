/*
 * task_execution.proto
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: version not set
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.OUTPUTONLYPorts;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Executor describes a command to run, and its environment.
 */
@ApiModel(description = "Executor describes a command to run, and its environment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-21T14:19:55.302Z")
public class TesExecutor {
  @SerializedName("image_name")
  private String imageName = null;

  @SerializedName("cmd")
  private List<String> cmd = null;

  @SerializedName("workdir")
  private String workdir = null;

  @SerializedName("stdin")
  private String stdin = null;

  @SerializedName("stdout")
  private String stdout = null;

  @SerializedName("stderr")
  private String stderr = null;

  @SerializedName("ports")
  private List<OUTPUTONLYPorts> ports = null;

  @SerializedName("environ")
  private Map<String, String> environ = null;

  public TesExecutor imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

   /**
   * Name of the container image, for example: ubuntu quay.io/aptible/ubuntu gcr.io/my-org/my-image etc...
   * @return imageName
  **/
  @ApiModelProperty(value = "Name of the container image, for example: ubuntu quay.io/aptible/ubuntu gcr.io/my-org/my-image etc...")
  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  public TesExecutor cmd(List<String> cmd) {
    this.cmd = cmd;
    return this;
  }

  public TesExecutor addCmdItem(String cmdItem) {
    if (this.cmd == null) {
      this.cmd = new ArrayList<String>();
    }
    this.cmd.add(cmdItem);
    return this;
  }

   /**
   * The command to be executed.
   * @return cmd
  **/
  @ApiModelProperty(value = "The command to be executed.")
  public List<String> getCmd() {
    return cmd;
  }

  public void setCmd(List<String> cmd) {
    this.cmd = cmd;
  }

  public TesExecutor workdir(String workdir) {
    this.workdir = workdir;
    return this;
  }

   /**
   * The working directory that the command will be executed in. Defaults to the directory set by the container image.
   * @return workdir
  **/
  @ApiModelProperty(value = "The working directory that the command will be executed in. Defaults to the directory set by the container image.")
  public String getWorkdir() {
    return workdir;
  }

  public void setWorkdir(String workdir) {
    this.workdir = workdir;
  }

  public TesExecutor stdin(String stdin) {
    this.stdin = stdin;
    return this;
  }

   /**
   * Path inside the container to a file which will be piped to the command&#39;s stdin.
   * @return stdin
  **/
  @ApiModelProperty(value = "Path inside the container to a file which will be piped to the command's stdin.")
  public String getStdin() {
    return stdin;
  }

  public void setStdin(String stdin) {
    this.stdin = stdin;
  }

  public TesExecutor stdout(String stdout) {
    this.stdout = stdout;
    return this;
  }

   /**
   * Path inside the container to a file where the command&#39;s stdout will be written to.
   * @return stdout
  **/
  @ApiModelProperty(value = "Path inside the container to a file where the command's stdout will be written to.")
  public String getStdout() {
    return stdout;
  }

  public void setStdout(String stdout) {
    this.stdout = stdout;
  }

  public TesExecutor stderr(String stderr) {
    this.stderr = stderr;
    return this;
  }

   /**
   * Path inside the container to a file where the command&#39;s stderr will be written to.
   * @return stderr
  **/
  @ApiModelProperty(value = "Path inside the container to a file where the command's stderr will be written to.")
  public String getStderr() {
    return stderr;
  }

  public void setStderr(String stderr) {
    this.stderr = stderr;
  }

  public TesExecutor ports(List<OUTPUTONLYPorts> ports) {
    this.ports = ports;
    return this;
  }

  public TesExecutor addPortsItem(OUTPUTONLYPorts portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<OUTPUTONLYPorts>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Port to expose from within the container, blank if none.
   * @return ports
  **/
  @ApiModelProperty(value = "Port to expose from within the container, blank if none.")
  public List<OUTPUTONLYPorts> getPorts() {
    return ports;
  }

  public void setPorts(List<OUTPUTONLYPorts> ports) {
    this.ports = ports;
  }

  public TesExecutor environ(Map<String, String> environ) {
    this.environ = environ;
    return this;
  }

  public TesExecutor putEnvironItem(String key, String environItem) {
    if (this.environ == null) {
      this.environ = new HashMap<String, String>();
    }
    this.environ.put(key, environItem);
    return this;
  }

   /**
   * Enviromental variables to set within the container.
   * @return environ
  **/
  @ApiModelProperty(value = "Enviromental variables to set within the container.")
  public Map<String, String> getEnviron() {
    return environ;
  }

  public void setEnviron(Map<String, String> environ) {
    this.environ = environ;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TesExecutor tesExecutor = (TesExecutor) o;
    return Objects.equals(this.imageName, tesExecutor.imageName) &&
        Objects.equals(this.cmd, tesExecutor.cmd) &&
        Objects.equals(this.workdir, tesExecutor.workdir) &&
        Objects.equals(this.stdin, tesExecutor.stdin) &&
        Objects.equals(this.stdout, tesExecutor.stdout) &&
        Objects.equals(this.stderr, tesExecutor.stderr) &&
        Objects.equals(this.ports, tesExecutor.ports) &&
        Objects.equals(this.environ, tesExecutor.environ);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageName, cmd, workdir, stdin, stdout, stderr, ports, environ);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TesExecutor {\n");
    
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
    sb.append("    workdir: ").append(toIndentedString(workdir)).append("\n");
    sb.append("    stdin: ").append(toIndentedString(stdin)).append("\n");
    sb.append("    stdout: ").append(toIndentedString(stdout)).append("\n");
    sb.append("    stderr: ").append(toIndentedString(stderr)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    environ: ").append(toIndentedString(environ)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

