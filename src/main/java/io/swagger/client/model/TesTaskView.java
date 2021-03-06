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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * TaskView affects the fields returned by the ListTasks endpoint.  Some of the fields in task can be large strings (e.g. logs), which can be a burden on the network. In the default BASIC view, these heavyweight fields are not included, however, a client may request the FULL version to include these fields.   - MINIMAL: Task message will include ONLY the fields:   Task.Id   Task.State  - BASIC: Task message will include all fields EXCEPT:   Task.ExecutorLog.stdout   Task.ExecutorLog.stderr   TaskParameter.Contents in Task.Inputs  - FULL: Task message includes all fields.
 */
@JsonAdapter(TesTaskView.Adapter.class)
public enum TesTaskView {
  
  MINIMAL("MINIMAL"),
  
  BASIC("BASIC"),
  
  FULL("FULL");

  private String value;

  TesTaskView(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TesTaskView fromValue(String text) {
    for (TesTaskView b : TesTaskView.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TesTaskView> {
    @Override
    public void write(final JsonWriter jsonWriter, final TesTaskView enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TesTaskView read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TesTaskView.fromValue(String.valueOf(value));
    }
  }
}

