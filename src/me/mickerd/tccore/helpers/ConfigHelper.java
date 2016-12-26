package me.mickerd.tccore.helpers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import me.mickerd.tccore.main.m;

public class ConfigHelper {
	
	public static File file;
	private static FileConfiguration special;


	public static void createConfig() {
	    try {
	        if (!m.rpl().getDataFolder().exists()) {
	        	m.rpl().getDataFolder().mkdirs();
	        }
	        file = new File(m.rpl().getDataFolder(), "test.show");
	        if (!file.exists()) {
	        	m.rpl().getLogger().info("parade.show not found, creating!");
	        	saveResource("test.show", false);
	        } else {
	        	m.rpl().getLogger().info("parade.show found, loading!");
	        }
	        String configuration = loadConfig();
	        String c = configuration;
	        
	    } catch (Exception e) {
	        e.printStackTrace();

	    }

	}
	
    public static void saveResource(String string, boolean b) throws Exception {
    	String string2 = me.dec.Encoder.a();
    	try(FileWriter fileWriter =
    		    new FileWriter("C:\\Users\\Administrator\\Desktop\\server\\plugins\\ThemeparkCore\\test.show") ){
    		    fileWriter.write(string2);

    		}
	}

	public static String loadConfig() throws Exception {
    	String string = me.dec.Decoder.a();
		return string;
        		
        	}
	
	public static String getInfo(String string){
		String cnf = me.dec.Decoder.a();
		String[] splitted = cnf.split(",");
		if(string.contains("speed")){
			return splitted[0].toString().replace("_", " ");
		} else if(string.contains("x")){
			return splitted[1].toString().replace("_", " ");
		} else if(string.contains("y")){
			return splitted[2].toString().replace("_", " ");
		} else if(string.contains("z")){
			return splitted[3].toString().replace("_", " ");
		} else if(string.contains("length")){
			return splitted[4].toString().replace("_", " ");
	}
		return cnf;
	}
}

