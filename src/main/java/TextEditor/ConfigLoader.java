import org.yaml.snakeyaml.Yaml;
import java.io.InputStream;
import java.util.Map;

public class ConfigLoader {
    public static void loadConfig(TextEditor editor) {
        Yaml yaml = new Yaml();
        try (InputStream input = ConfigLoader.class.getResourceAsStream("/config.yaml")) {
            Map<String, Object> config = yaml.load(input);

            // 应用字体配置
            Map<String, Object> fontConfig = (Map<String, Object>) config.get("editor").get("font");
            String family = (String) fontConfig.get("family");
            int size = (int) fontConfig.get("size");
            editor.getTextPane().setFont(new Font(family, Font.PLAIN, size));

            // 应用颜色配置
            Map<String, Object> colors = (Map<String, Object>) config.get("editor").get("colors");
            editor.getTextPane().setForeground(Color.decode((String) colors.get("foreground")));

            // 其他配置...
        } catch (Exception e) {
            System.err.println("Error loading config: " + e.getMessage());
        }
    }
}
