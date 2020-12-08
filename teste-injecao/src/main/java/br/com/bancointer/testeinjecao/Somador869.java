package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador869")
public class Somador869 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
