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


package io.swagger.client.api
import io.swagger.client.ApiException
import io.swagger.client.model.Body
import io.swagger.client.model.OUTPUTONLY
import io.swagger.client.model.OUTPUTONLY3
import io.swagger.client.model.OUTPUTONLY4
import io.swagger.client.model.OUTPUTONLYExecutors
import io.swagger.client.model.OUTPUTONLYTasks
import org.junit.Ignore
import org.junit.Test
/**
 * API tests for TaskServiceApi
 */
@Ignore
public class TaskServiceApiTest {

    private final TaskServiceApi api = new TaskServiceApi();

    
    /**
     * Cancel a task.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelTaskTest() throws ApiException {
        String id = null;
        Object response = api.cancelTask(id);

        // TODO: test validations
    }
    
    /**
     * Create a new task.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTaskTest() throws ApiException {
        def exec = new OUTPUTONLYExecutors();
        exec.cmd = ['echo foo']
        exec.imageName = 'debian:wheezy'
        exec.stdout
        def body = new Body()
        body.description = "task description"
        body.name = "task name"
        body.id = "1234"
        body.project = "foo"
        body.executors = [exec]

//        def infile1 = new OUTPUTONLYInputs()
//        infile1.type = OUTPUTONLYInputs.TypeEnum.FILE
//        infile1.path = '/README.md'
//        infile1.url = 'https://raw.githubusercontent.com/nextflow-io/nextflow/master/README.md'
//        body.inputs = [infile1]

        OUTPUTONLY3 response = api.createTask(body);
        println response.id

        def OUTPUTONLYTasks tasks = api.getTask(response.id, null)
        println tasks.getState()

        // TODO: test validations
    }
    
    /**
     * GetServiceInfo provides information about the service, such as storage details, resource availability, and  other documentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getServiceInfoTest() throws ApiException {
        OUTPUTONLY4 response = api.getServiceInfo();

        // TODO: test validations
    }
    
    /**
     * Get a task. TaskView is requested as such: \&quot;v1/tasks/{id}?view&#x3D;FULL\&quot;
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaskTest() throws ApiException {
        String id = null;
        String view = null;
        OUTPUTONLYTasks response = api.getTask(id, view);

        // TODO: test validations
    }
    
    /**
     * List tasks. TaskView is requested as such: \&quot;v1/tasks?view&#x3D;BASIC\&quot;
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTasksTest() throws ApiException {
        String project = null;
        String namePrefix = null;
        Long pageSize = null;
        String pageToken = null;
        String view = null;
        OUTPUTONLY response = api.listTasks(project, namePrefix, pageSize, pageToken, view);

        // TODO: test validations
    }
    
}