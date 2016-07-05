package DaoFactory;

import Dao.CourseDao;
import Dao.PersonDao;
import Dao.ProfessorDao;
import Dao.SectionDao;
import Dao.StudentDao;
import Dao.TranscriptDao;

public interface DaoFactory {
	public StudentDao GetStudentInstance() throws Exception;
	public ProfessorDao GetProfessorInstance() throws Exception;
	public CourseDao GetCourseInstance() throws Exception;
	public SectionDao GetSectionInstance() throws Exception;
	public TranscriptDao GetTranscriptInstance() throws Exception;

	StudentDao createDao();
}
