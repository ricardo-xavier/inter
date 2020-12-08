package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador425")
public class Somador425 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
