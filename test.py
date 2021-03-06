import pydot

graph = pydot.Dot(graph_type='digraph', strict=True)

graph.add_edge(pydot.Edge("1", "2"))

graph.add_edge(pydot.Edge("1", "2"))

graph.add_edge(pydot.Edge("1", "3"))

graph.add_node(pydot.Node("u"))

graph.write_png("out.png")

