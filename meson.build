project('hello-meson', 'c', version: '1.0', default_options: [ 'c_std=c11'])

srcs = [
  'src/hello-meson.c'
]

app = executable(
	meson.project_name(),
	sources : srcs,
	install: true
)
