# 251-Assignment1-2025-FreedaWang

# Advanced Text Editor

## Team Members
- **Member 1**: Freeda Wang(ID:20040510)

## Description
A Java-based text editor with syntax highlighting, PDF export, and advanced file handling capabilities.

## Features
- Syntax highlighting for Java, Python, and C++
- PDF export functionality
- File operations (New, Open, Save)
- Text search and editing tools
- Date/time insertion
- Print functionality

## How to Run Dockerfile
- Build image
docker build -t text-editor .

- Run container (Linux/macOS)
docker run -it --rm \
-e DISPLAY=$DISPLAY \
-v /tmp/.X11-unix:/tmp/.X11-unix \
text-editor

- Run container (Windows)
docker run -it --rm \
-e DISPLAY=host.docker.internal:0.0 \
text-editor

### Prerequisites
- Java 11 or higher
- Maven 3.6+
- Docker (optional)

### Running with Maven




https://github.com/OfeliaW/251-Assignment1-2025-FreedaWang.git
