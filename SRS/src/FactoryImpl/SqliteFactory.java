package FactoryImpl;

import Dao.CourseDao;
import Dao.PersonDao;
import Dao.ProfessorDao;
import Dao.SectionDao;
import Dao.StudentDao;
import Dao.TranscriptDao;
import DaoFactory.DaoFactory;
import DaoImpl.SqliteCourseDaoImpl;

import DaoImpl.SqliteProfessorDaoImpl;
import DaoImpl.SqliteSectionDaoImpl;
import DaoImpl.SqliteStudentDaoImpl;
import DaoImpl.SqliteTranscriptDaoImpl;

public class SqliteFactory implements DaoFactory {

	public SqliteFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public StudentDao createDao() {
		// TODO Auto-generated method stub
		return new SqliteStudentDaoImpl();
	}

	@Override
	public ProfessorDao GetProfessorInstance() throws Exception {
		// TODO Auto-generated method stub
		return new SqliteProfessorDaoImpl();
	}

	@Override
	public CourseDao GetCourseInstance() throws Exception {
		// TODO Auto-generated method stub
		return new SqliteCourseDaoImpl();
	}

	@Override
	public SectionDao GetSectionInstance() throws Exception {
		// TODO Auto-generated method stub
		return new SqliteSectionDaoImpl();
	}

	@Override
	public TranscriptDao GetTranscriptInstance() throws Exception {
		// TODO Auto-generated method stub
		return new SqliteTranscriptDaoImpl();
	}


	@Override
	public StudentDao GetStudentInstance() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
