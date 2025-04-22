package com.bank;

import java.io.FileOutputStream;
import java.io.PrintStream;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileLoggerImpl implements Logger {

	@Value("${logFilePath}")
	private String logFilePath;
	
	public FileLoggerImpl() {
		
	}
	
	public FileLoggerImpl(String logFilePath) {
		this.logFilePath = logFilePath;
	}

	public String getLogFilePath() {
		return logFilePath;
	}

	public void setLogFilePath(String logFilePath) {
		this.logFilePath = logFilePath;
	}

	@Override
	public void log(String message) {
		// System.out.println("FILE: " + message);
		try(FileOutputStream fout = new FileOutputStream(logFilePath, true)) {
			try(PrintStream out = new PrintStream(fout)) {
				out.println(message);
				
			}
		} // fout close
		catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
}
