package com.joeunseo.hotel.service.impl;

import com.joeunseo.hotel.model.domain.FileModel;
import com.joeunseo.hotel.model.domain.HotelModel;
import com.joeunseo.hotel.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {
    private static final String UPLOAD_DIR = "uploads";

    @Override
    public List<?> getList(FileModel files) {
        return List.of();
    }

    @Override
    public HotelModel getByHotelId(Long hotelId) {
        return null;
    }

    @Override
    public Boolean uploads(FileModel files) {
        return null;
    }

    @Override
    public Boolean update(FileModel files) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    //    public void uploadFile(MultipartFile file, String id, String roomNumber) throws IOException {
//        String currentWorkingDir = System.getProperty("user.dir");
//        System.out.println(id);
//
//        String fileUploadPath = Paths.get(currentWorkingDir, UPLOAD_DIR, id, roomNumber).toString();
//        File uploadDirFile = new File(fileUploadPath);
//
//        if (!uploadDirFile.exists()) {
//            if (uploadDirFile.mkdirs()) {
//                System.out.println("Directory created: " + uploadDirFile.getAbsolutePath());
//            } else {
//                throw new IOException("Failed to create directory: " + uploadDirFile.getAbsolutePath());
//            }
//        }
//
//        File destinationFile = new File(uploadDirFile, file.getOriginalFilename());
//        try {
//            file.transferTo(destinationFile);
//            System.out.println("File saved: " + destinationFile.getAbsolutePath());
//        } catch (IOException e) {
//            e.printStackTrace();
//            throw new IOException("Failed to save file: " + destinationFile.getAbsolutePath(), e);
//        }
//    }


}
