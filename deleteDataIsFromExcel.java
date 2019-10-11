package scripts;

import java.io.IOException;

import utility.WriteToExcelFile;

public class deleteDataIsFromExcel {

	public static void main(String[] args) throws IOException {
		WriteToExcelFile delete = new WriteToExcelFile();
		
		//Delete data from building
		//buildingFilePath: "D:\\SMS8.1-2019\\test\\resources\\data\\BuildingData.xlsx"
		delete.deleteDataFromExcel("D:\\SMS8.1-2019\\test\\resources\\data\\BuildingData.xlsx","Data",0,0); //delete buildingId
		delete.deleteDataFromExcel("D:\\SMS8.1-2019\\test\\resources\\data\\BuildingData.xlsx","editBuilding",1,1); //delete buildingId
		delete.deleteDataFromExcel("D:\\SMS8.1-2019\\test\\resources\\data\\BuildingData.xlsx","deleteBuilding",1,1); //delete buildingId
		delete.deleteDataFromExcel("D:\\SMS8.1-2019\\test\\resources\\data\\BuildingData.xlsx","dataForSideLinks",1,1); //delete buildingId
	}
}
