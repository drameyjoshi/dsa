class Visitor:
    __init__(self):
        pass

    @abstractmethod
    def visit_assign_expr(self):
        pass

    @abstractmethod
    def visit_binary_expr(self):
        pass

    @abstractmethod
    def visit_call(self):
        pass

    @abstractmethod
    def visit_getter(self):
        pass

    @abstractmethod
    def visit_groupring(self):
        pass

    @abstractmethod
    def visit_literal(self):
        pass

    @abstractmethod
    def visit_logical(self):
        pass

    @abstractmethod
    def visit_setter(self):
        pass

    @abstractmethod
    def visit_super(self):
        pass

    @abstractmethod
    def visit_this(self):
        pass

    @abstractmethod
    def visit_unary(self):
        pass

    @abstractmethod
    def visit_variable(self):
        pass

