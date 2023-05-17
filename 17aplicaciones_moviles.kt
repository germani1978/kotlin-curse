class Task(val id: Int, var taskName: String, var isCompleted: Boolean)

class TaskListAdapter(private val tasks: List<Task>) : RecyclerView.Adapter<TaskListAdapter.TaskViewHolder>() {

    inner class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val taskName: TextView = itemView.findViewById(R.id.taskName)
        val checkbox: CheckBox = itemView.findViewById(R.id.checkbox)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.task_item, parent, false)
        return TaskViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = tasks[position]
        holder.taskName.text = task.taskName
        holder.checkbox.isChecked = task.isCompleted
        holder.checkbox.setOnCheckedChangeListener { _, isChecked ->
            task.isCompleted = isChecked
        }
    }

    override fun getItemCount() = tasks.size
}

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var taskListAdapter: TaskListAdapter
    private var tasks = mutableListOf<Task>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        taskListAdapter = TaskListAdapter(tasks)
        recyclerView.adapter = taskListAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        findViewById<Button>(R.id.addTaskButton).setOnClickListener {
            addTask()
        }
    }

    private fun addTask() {
        val taskName = findViewById<EditText>(R.id.taskNameEditText).text.toString()
        if (taskName.isNotBlank()) {
            val task = Task(tasks.size, taskName, false)
            tasks.add(task)
            taskListAdapter.notifyItemInserted(tasks.size - 1)
            findViewById<EditText>(R.id.taskNameEditText).text.clear()
        }
    }
}


/*
Este código utiliza un RecyclerView para mostrar una lista de tareas pendientes. El adaptador personalizado TaskListAdapter se encarga de mostrar cada tarea en un itemView personalizado. El MainActivity es responsable de la gestión de la lista de tareas y de la interfaz de usuario, como el botón para agregar una nueva tarea.
*/